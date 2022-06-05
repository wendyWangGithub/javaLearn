package com.test.basic;

import java.util.UUID;


/**
 * https://blog.csdn.net/qq_42000661/article/details/107000164?utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~all~first_rank_v2~rank_v25-3-107000164.nonecase&utm_term=mysql%E7%9A%84uuid%E6%98%AF%E4%BB%80%E4%B9%88%E7%B1%BB%E5%9E%8B
 * UUID生成一个唯一的识别码
 *
 *
 */
public class UUIDTest {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString().replace("-",""));
    }

}
