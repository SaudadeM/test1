package 作业.数组模拟栈;

import java.lang.annotation.ElementType;

/*
* 	编写程序，使用一维数组，模拟栈数据结构。
	要求：
		1、这个栈可以存储java中的任何引用类型的数据。
		2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
		3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
		4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。

		public class MyStack{ // 栈类

			// 提供一个数组来存储栈中的元素
			Object[] elements;

			// 栈帧（永远指向栈顶部的元素）
			// 每加1个元素，栈帧+1
			// 每减1个元素，栈帧-1
			int index;

			// 构造方法
			// 构造方法是不是应该给一维数组一个初始化容量。

			// push方法（push方法压栈）
			// 压栈表示栈中多一个元素。
			// 但是栈如果已满，压栈失败。
			// 这个方法的参数以及返回值类型自己定义。

			// pop方法（pop方法弹栈）
			// 弹栈表示栈中少一个元素。
			// 但是栈如果已空，弹栈失败。
			// 这个方法的参数以及返回值类型自己定义。

		}
		*
		* 字符串不许需要new也是一个对象 如 "abd"就是一个对象

		main(){
			测试...
		}
* */
public class Mystack {
    // 提供一个数组来存储栈中的元素
    Object[] elements = new Object[3];

    // 栈帧（永远指向栈顶部的元素）
    // 每加1个元素，栈帧+1
    // 每减1个元素，栈帧-1
    int index = 0;

    public Mystack() {
    }

    //    压栈
    public void push(Object[] elements){
        this.elements = elements;
        this.index = elements.length;

        if(index <= 2){     //如果传递过来的元素小于index则压栈成功
            for (int i = 0; i < index; i++) {
                System.out.println("压栈成功");
            }
        }
        else if(index >= 3){
            System.out.println("超出栈的容量，压栈失败");
        }
    }

//    弹栈
    public void pop(){

    }
}
