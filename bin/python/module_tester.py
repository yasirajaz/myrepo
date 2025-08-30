# 1.import my module
#2.from mymodule import add, if we write only this the only add function will execute,we canwrite any number of function in (from)

import mymodule

 #from mymodule import add,info
a=mymodule.add(2,4,10)
print(a)
b=mymodule.info('yasir','ajaz')
print(b)


#3. we can use alias import add as ad and then we call it by ad to avoid duplicacy

from mymodule import add as ad
a=ad(1,2,3)
print(a)


# 4.alias module, no need to alias function bcz it chnages also 
import mymodule as mm
a=mm.add(1,3,34)
print(a)



#5.to import all by from
from mymodule import *
a=mymodule.add(11,2,3)
print(a)



# NOTE;- only comment can be written before the import statement
