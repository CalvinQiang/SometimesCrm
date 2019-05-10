# Eclipse项目向IDEA项目迁移

- 首先准备材料,迁移git项目：https://github.com/ConciseLiu/SometimesCrm

1.下载crm项目至本地
```bash
git@github.com:ConciseLiu/SometimesCrm.git
```
- 过程如图所示：

![下载项目](./img/1_clone_project.png)

2.在idea中导入下载的项目

- 在导航栏中选择 File -> New -> Project from Existing Sources

![导入项目](./img/2_idea_1.png)

- 选择我们刚刚下载好的项目路径，点击OK

![导入项目](./img/2_idea_2.png)

- 选择eclipse项目

![导入项目](./img/2_idea_3.png)

- 确认导入项目，一直next,一路无话

![导入项目](./img/2_idea_4.png)

- 一直next

![导入项目](./img/2_idea_5.png)

- 一直next

![导入项目](./img/2_idea_6.png)

- 一直next

![导入项目](./img/2_idea_7.png)

- 一直next

![导入项目](./img/2_idea_8.png)

3.经过上面的操作，我们已经用idea打开了项目，下面开始设置项目

- 导航File ->project structure

![导入项目](./img/3_project_structure_1.png)

- 点击Project Settings->Project 确认使用的是jdk8.0

![导入项目](./img/3_project_structure_2.png)

- 点击Project Settings->Modules  删除错误的依赖

![导入项目](./img/3_project_structure_3.png)

- 新增信息的依赖

![导入项目](./img/3_project_structure_4.png)

- 选择crm自身加入的jar包（全选lib文件夹下的所有jar文件）

![导入项目](./img/3_project_structure_5.png)

- 点击确认

![导入项目](./img/3_project_structure_6.png)

- 点击Project Settings->Facets 选择web

![导入项目](./img/3_project_structure_7.png)

- 点击确定

![导入项目](./img/3_project_structure_8.png)

- 在Web Resource  directories 选项卡中指定对应的目录

![导入项目](./img/3_project_structure_9.png)

- 选择WebRoot或者WebContent，点击Apply

![导入项目](./img/3_project_structure_10.png)

- 选择对应的项目 点击 from modules

![导入项目](./img/3_project_structure_11.png)

- 一路点击OK即可

![导入项目](./img/3_project_structure_12.png)

4.配置tomcat

- 点击配置

![导入项目](./img/4_config_tomcat_1.png)

- 选择tomcat

![导入项目](./img/4_config_tomcat_2.png)

- 点击修复错误

![导入项目](./img/4_config_tomcat_3.png)

- 完成对tomcat的配置

![导入项目](./img/4_config_tomcat_4.png)

- 这个时候启动项目会报错，提示找不到HttpServletResponse的类文件

![导入项目](./img/4_config_tomcat_5.png)

- 这个时候只需要加入外部tomcat安装目录下的jar文件即可

![导入项目](./img/4_config_tomcat_6.png)

- 选择tomcat安装目录下的servlet-api.jar文件

![导入项目](./img/4_config_tomcat_7.png)

5.至此，Eclipse项目向Idea项目工作已完成，开始我们开发之路吧

- 参考资料

    1.[Eclipse java web项目 ，导入IntelliJ IDEA 完整操作！](https://blog.csdn.net/ssh159/article/details/71305706)
    
    2.[IntelliJ IDEA 出现" java: 程序包javax.servlet不存在、 java: 程序包javax.servlet.annotation"等错误](https://blog.csdn.net/wust_lh/article/details/73469789)
    
    3.[idea导入eclipse项目](https://zhuanlan.zhihu.com/p/28749214)




