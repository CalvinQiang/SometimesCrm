# Ognl表达式语言

#### 什么是Onal?

- OGNL是Object-Graph Navigation Language的缩写，它是一种功能强大的表达式语言.

#### Onal与Struts2的关系

- Struts2的标签库都是使用OGNL表达式来访问ActionContext中的对象数据的。如：<s:propertyvalue="xxx"/>。
- Struts2将ActionContext设置为OGNL上下文，并将值栈作为OGNL的根对象放置到ActionContext中。
- 调用ActionContext的put(key,value)放入的数据，需要使用#访问。

- 参考资料

	1. [java框架篇---struts之OGNL详解](https://www.cnblogs.com/oumyye/p/4361812.html)
	2. [ognl 详解 Struts2中的OGNL表达式](https://www.xuebuyuan.com/3248001.html)
	3. [OGNL之简述](https://blog.csdn.net/mmake1994/article/details/81628860)
	