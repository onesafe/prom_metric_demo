#!/usr/bin/env bash

export LANG=en_US.UTF-8

# 设置jvm内存
source /app/bin/set_memory.sh
set_set_java_opts

# logs文件夹不存在就创建
if [ ! -d "/app/logs" ]; then
  mkdir /app/logs
fi

java -jar /app/demo-0.0.1-SNAPSHOT.jar


while [ -f "DEBUG" ]; do
    sleep 3
done
