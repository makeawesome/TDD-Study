from WasRun import WasRun
from TestCase import TestCase

class TestCaseTest(TestCase):
    def setUp(self):
        pass

    def testTemplateMethod(self):
        self.test = WasRun("testMethod")
        self.test.run()
        assert("setUp testMethod tearDown " == self.test.log)

TestCaseTest("testTemplateMethod").run()