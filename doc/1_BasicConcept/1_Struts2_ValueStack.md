## 值栈(ValueStack)

#### 1. 什么是值栈
- 值栈：ValueStack，类似于域对象，值栈应用在Struts2的action里面。
-  在值栈中可以存值和取值。其贯穿整个 Action 的生命周期(每个 Action 类的对象实例都拥有一个 ValueStack 对象). 相当于一个数据的中转站。
- 每次访问action时候，都会创建action对象，那么，在每个action对象里面就都存在一个值栈对象。

#### 2.使用范围
- 仅在action范围内

#### 3.内部结构
内部结构有两个逻辑单元
- 一个对象栈：root ，CompoundRoot就是一个ArrayList.
- 一个ContextMap ，context OgnlContext就是一个Map.

#### 4.向值栈保存数据

- push :将对象压入到栈顶.
- set :将对象压入到栈顶.

- 获取值栈对象有多种方式，常用方式是通过调用ActionContext对象的getValueStack方法获取值栈对象

```java
// 1. 获取ActionContext对象
ActionContext context = ActionContext.getContext();
// 2. 调用ActionContext对象的方法获取值栈对象
ValueStack valueStack = context.getValueStack();
```
- 在每个Action对象中只有一个值栈对象

```java
ActionContext context = ActionContext.getContext();
ValueStack valueStack1 = context.getValueStack();
ValueStack valueStack2 = context.getValueStack();
System.out.println(valueStack1 == valueStack2); // 同一值栈对象
```

#### 5.使用debug标签查看值栈结构和存储值
- 通过访问Action，执行Action中的方法，返回结果，匹配返回值对应转发的JSP页面，在该JSP页面中使用该标签。
- 值栈对象存在于Action中，访问Action同时也是创建Action的过程，Action对象将拥有一个值栈对象。

- VSDebugAction.java

```java
package com.wm103.action;
import com.opensymphony.xwork2.ActionSupport;

public class VSDebugAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
```

- 在struts.xml中的配置

```java
<package name="demo1" extends="struts-default" namespace="/">
    <action name="debug" class="com.wm103.action.VSDebugAction">
        <result name="success">/debug.jsp</result>
    </action>
</package>
```

- debug.jsp

```java
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入struts标签库--%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>debug标签的使用</title>
</head>
<body>
    <%--使用struts2标签查看值栈结构--%>
    <s:debug></s:debug>
</body>
</html>
```


- 参考资料

	1. [进阶Java之Struts中的值栈](https://blog.csdn.net/kdc18333608478/article/details/52783351)
	2. [Struts2框架自学之路——值栈](https://blog.csdn.net/qq_15096707/article/details/72781005)