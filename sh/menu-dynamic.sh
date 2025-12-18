#!/bin/bash
java -cp "../libs/generator.jar:../libs/postgresql-42.7.8.jar" \
    org.mybatis.generator.api.ShellRunner \
    -configfile ../config/menu-dynamic-config.xml -overwrite

