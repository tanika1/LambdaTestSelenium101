package com.lambdaTest.testcases;

import com.lambdaTest.pages.DragAndDropPage;
import com.lambdaTest.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDropPageTest extends BaseTest {

    @Test(priority =1)
    public void verifySlider(){
         page.getInstance(HomePage.class).clickDragDropLink();
          page.getInstance(DragAndDropPage.class).dragBar(95-15);
          String range = page.getInstance(DragAndDropPage.class).getSlidingRange();
        System.out.println("Sliding Range is :" + range);
        Assert.assertEquals(range,"95");
    }

}

