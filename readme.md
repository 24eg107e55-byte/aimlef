
backend 
setup : spring init --build=maven --dependencies=web,thymeleaf,devtools,mysql,data-jpa  --package=jar --name=demo demo

install : mvn clean install -DskipTests

run     : mvn spring-boot:run


frontend 

setup : npm create vite@latest ./  or npm create vite@latest frontend

install : npm install  or npm i

run :  npm run dev or npm run dev -- --host


mysql 

local = mysql -u (****) -p
        password :  ****
cloud = mysql -h -P -u dbname -p
        password : ****

