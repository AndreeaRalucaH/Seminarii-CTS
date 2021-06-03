package ro.ase.cts.junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestGrupaWithDummy.class, TestPromovabilitateaWithStub.class, TestPromovabilitateWithFake.class })
public class AllTests {

}
