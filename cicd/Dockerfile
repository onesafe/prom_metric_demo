FROM docker.4pd.io/base-image-openjdk8:1.0.1

MAINTAINER wangyiping@4paradigm.com

COPY release /app

EXPOSE 51088

ENTRYPOINT ["/bin/bash", "/app/bin/start.sh"]
