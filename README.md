# demo-mybatis-generator
mybatis 관련 코드 생성용 데모 

## MyBatis Generator

- 💡 [MyBatis Generator Quick start Guide](https://mybatis.org/generator/quickstart.html)
- [source :: MyBatis Generator: Github](https://github.com/mybatis/generator)

## 폴더 구조

```txt
[project root]
    ⎿ config : 설정 파일들 
    ⎿ libs
        ⎿ generator.jar : Mybatis generator 1.4.3
        ⎿ postgresql-42.7.8.jar : PostgreSQL driver
    ⎿ sh : 필요한 sh파일 작성해서 두는 곳
    ⎿ target : 설정 파일에 따라 다른 걸로 변경해도 됨 (.gitignore)     
```

## 기본 사용법(mybatis-dynamic-sql 예시)

- 프로젝트 sh폴더에서  
```sh
$ ./menu.sh 
```


## 실행환경
- mybatis generator 의 실행환경을 따른다
- 현재 jdk17 이상 