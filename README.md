# JAndroidLib
一个Android项目的基本框架，用于封装项目中通用的、非业务的部分。

## 项目起源

  刚刚开始研读包建强先生所著的《APP研发录》，对第一章中所说的重构方法很是赞同，于是决定自己动手写一个框架，把Android项目中那些非业务代码封装在一个类库中。

  当然了，这个类库还是要参照包先生的AndroidLib进行改造。

## 封装了什么

  1. 优化Activity的生命周期

    这里只是简单的为Activity添加了三个初始化抽象函数

  2. 网络加载模块

  3. 图片加载模块

      首先做的工作是使用工厂方法模式和建造者模式把两大流行图片加载框架封装起来，使用方法如下：
      ```java
      //使用默认图片加载框架
      BuilderFactory.createDefaultBulider()
              .attachTo(mImgShow1)
              .loadFrom(url1)
              .with(this)
              .build()
              .load();

      //使用Picasso图片加载框架
      BuilderFactory.createBuilder(PicassoBuilder.class)
              .attachTo(mImgShow2)
              .loadFrom(url2)
              .with(this)
              .build()
              .load();
      ```
      接下来的工作就是自己实现一个轻量级的图片加载框架。
      
  4. 数据库模块

  5. 回调接口

    目前仅仅创建了三个回调接口:
    * Action1

    * Action2<T>

    * Action3<K,V>
  6. 点击事件

  7. Adapter（对我之前写过的JItemPool进行优化）

  8. ....

## Tip

  本项目开发会使用Java和Kotlin进行混合开发。
