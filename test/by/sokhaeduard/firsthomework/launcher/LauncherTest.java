package by.sokhaeduard.firsthomework.launcher;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.sokhaeduard.firsthomework.service.TestDotLogic;
import by.sokhaeduard.firsthomework.service.TestFigureLogic;
import by.sokhaeduard.firsthomework.service.TestNumberLogic;
import by.sokhaeduard.firsthomework.service.TestTimeLogic;

@Suite.SuiteClasses({TestDotLogic.class, TestFigureLogic.class, TestNumberLogic.class, TestTimeLogic.class})
@RunWith(Suite.class)
public class LauncherTest {

}
