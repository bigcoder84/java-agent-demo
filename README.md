# java-agent-demo

本项目是Java Agent技术示例项目

## agent-first
第一个agent模块，用于测试在启动时动态增强cn.bigcoder.demo.agenttest.Person.test方法，打印方法耗时。Agent入口：cn.bigcoder.demo.agentfirst.MyTransformer

该模块使用了 javassist 对字节码进行了增强。具体使用方式可参考：
> 官方文档：http://www.javassist.org/tutorial/tutorial.html
> 
> CSDN博客：https://blog.csdn.net/qq_32506963/article/details/72851713



## agent-test

用于测试agent-first模块。

启动前需构建 `agent-first` 模块

```shell
cd ./agent-first
mvn assembly:assembly
```
构建好后，会在target目录下生成 `agent-first-1.0-SNAPSHOT-jar-with-dependencies.jar` 文件

启动时需增加 `--javaagent:xxxx\agent-first\target\agent-first-1.0-SNAPSHOT-jar-with-dependencies.jar` JVM参数，这样才能成功启动agent，动态加强字节码。

