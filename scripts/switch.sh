#!/usr/bin/env bash

ABSPATH=$(readlink -f $0)
ABSDIR=$(dirname $ABSPATH)
source ${ABSDIR}/profile.sh

function switch_proxy() {
    IDLE_PORT=$(find_idle_port)

    echo "> 전환할 Port: $IDLE_PORT"
    echo "> Port 전환"
    echo "set \$service_url http://127.0.0.1:${IDLE_PORT};" | sudo tee /etc/nginx/conf.d/service-url.inc #1

    echo "> Nginx Reload"
    sudo service nginx reload #2
}

#1 : 하나의 문장을 만들어 파이프라인으로 넘겨주기 위해 echo 를 사용한다. Nginx 가 변경할 프록시 주소를 생성한다.
#    쌍따옴표를 사용해야 한다. 사용하지 않으면 $service_url 을 그대로 인식하지 못하고 변수를 찾게 된다.
#    파이프라인 앞에서 넘겨준 문장을 service-url.inc 에 덮어쓴다.

#2 : Nginx 설정을 다시 불러온다. restart 와 다르다. restart 는 잠시 끊기는 현상이 있지만, reload 는 끊김 없이 다시 불러온다.
#    다만, 중요한 설정들은 반영되지 않으므로 restart 를 사용해야 한다. 여기선 외부의 설정 파일인 service-url 을 다시 불러오는 거라 reload 로 가능하다.