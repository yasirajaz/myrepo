import unittest
from name import formatted_name
class NameTestCase(unittest.TestCase):
	def test_first_last_name(self):
		fname=formatted_name('manoj','kumar')
		self.assertEqual(fname,'Manoj Kumar')
	def test_first_middle_last_name(self):
		fname=formatted_name('ashoke','kumar','singh')
		self.assertEqual(fname,'Ashoke Singh Kumar')
if __name__ =='__main__':
	unittest.main()
