# docker build -t staff_joy_mysql ./docker_mysql
# docker run -d --name=lx_mysql -p 3306:3306 -v ~/Code/dockerEnv/src/mysql/data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 -it worden/mysql


FROM mysql:5.7

ADD ./my_custom.cnf /etc/mysql/conf.d/my_custom.cnf

WORKDIR /worden

VOLUME ["/worden"]