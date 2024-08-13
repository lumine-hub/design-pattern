package com.xlm;

import com.xlm.design.Matter;

/**
 * @author xlm
 * 2024/8/13 下午5:24
 */
public interface IMenu {

    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter);    // 涂料

    IMenu appendFloor(Matter matter);   // 地板

    IMenu appendTile(Matter matter);    // 地砖

    String getDetail();                 // 明细

}
