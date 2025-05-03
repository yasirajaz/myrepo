def add (x,*args): # (x,*args) we can pass any number of argument from 0 to infinite
# it is form of list
        sum=x
        for a in args:
               sum=sum+a
        return sum



def info(firstname,lastname,**kargs):
        dict={'firstname':firstname,'lastname':lastname}
        for k,v in kargs.items():
                dict[k]=v
        return dict
