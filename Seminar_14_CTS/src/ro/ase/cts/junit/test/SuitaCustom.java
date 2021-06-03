package ro.ase.cts.junit.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteNormaleCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;

@RunWith(Categories.class)
@SuiteClasses({ TestGrupa.class, TestGrupaWithDummy.class, TestPromovabilitateaWithStub.class, TestPromovabilitateWithFake.class })
//@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory({TesteNormaleCategory.class, TesteUrgenteCategory.class})
public class SuitaCustom {

}
