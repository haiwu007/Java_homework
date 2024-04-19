# 整体结构

```
├─.settings
├─bin
│  └─homeworkShape
├─doc	
└─src
    └─homeworkShape
```

bin：编译结果

doc：错误&解决文档

src：源码

# 代码解释

| 类名                  | 功能                                                         |
| --------------------- | ------------------------------------------------------------ |
| planeShape            | 抽象平面图形类                                               |
| solidShapeInterface   | 立体图形接口                                                 |
| planeShape_square     | 正方形类实现                                                 |
| planeShape_triangle   | 三角形类实现                                                 |
| planeShape_circle     | 圆形类实现                                                   |
| planeShape_pentagon   | 正五边形类实现                                               |
| planeShape_anyPolygon | 任意多边形实现（使用所有点初始化，高斯面积公式计算面积）     |
| solidShape_cylinder   | 圆柱体类实现                                                 |
| solidShape_cone       | 圆锥体类实现                                                 |
| solidShape_sphere     | 球体类实现                                                   |
| utils                 | point点类实现                                                |
| planeShape_main       | 作业4main入口函数，可使用命令行设置参数，生成对应shape并获取所需的参数 |
| solidShape_main       | 作业5main入口函数，可使用命令行设置参数，生成对应shape并获取所需的参数 |

 github作业项目地址：[haiwu007/Java_homework: repository for my java lesson bupt 2024 (github.com)](https://github.com/haiwu007/Java_homework)

 

