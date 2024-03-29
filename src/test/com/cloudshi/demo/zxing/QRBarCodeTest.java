package com.cloudshi.demo.zxing;

import com.cloudshi.demo.zxing.utils.QRBarCodeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest
@RunWith(SpringRunner.class)
public class QRBarCodeTest {
    @Test
    public void createTest() {
        QRBarCodeUtil.createCodeToFile("https://www.baidu.com/",
                new File("./"), "baidu.png");

//        QRBarCodeUtil.createCodeToOutputStream("https://www.baidu.com/", System.out);
    }

    @Test
    public void parseTest() throws MalformedURLException {
//        System.out.println(QRBarCodeUtil.parseQRCodeByFile(new File("./baidu.png")));

        System.out.println(QRBarCodeUtil.parseQRCodeByUrl(new URL("https://res.wx.qq.com/mpres/htmledition/images/mp_qrcode3a7b38.gif")));
    }



}
