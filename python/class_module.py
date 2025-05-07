class Human:
	def __init__ (self): #if we cant make constructor then if makes by default i.e no need of init
		pass
	def canWalk(self):
		print("humans can walk 10 km a day")

class Boy(Human):
	def __init__(self):
		self.gender='male'
		self.walk=10
	def canWalk(self):
		super().canWalk() # it will call parent class as well
		print(f'{self.gender} can walk {self.walk}km')
b=Boy()
b.canWalk()
