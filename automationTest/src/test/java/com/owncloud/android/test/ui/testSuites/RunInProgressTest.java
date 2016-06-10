package com.juntadeandalucia.nube.test.ui.testSuites;

import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import com.juntadeandalucia.nube.test.ui.groups.FlexibleCategories;
import com.juntadeandalucia.nube.test.ui.groups.InProgressCategory;
import com.juntadeandalucia.nube.test.ui.groups.FlexibleCategories.TestClassPrefix;
import com.juntadeandalucia.nube.test.ui.groups.FlexibleCategories.TestClassSuffix;
import com.juntadeandalucia.nube.test.ui.groups.FlexibleCategories.TestScanPackage;


@RunWith(FlexibleCategories.class)
@IncludeCategory(InProgressCategory.class)
@TestScanPackage("com.owncloud.android.test.ui.testSuites")
@TestClassPrefix("")
@TestClassSuffix("TestSuite")
public class RunInProgressTest {

}
