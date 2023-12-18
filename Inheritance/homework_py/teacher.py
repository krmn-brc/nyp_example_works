from person import Person

class Teacher(Person):
    def __init__(self, name:str, classRoom:str, age:int, branches:[]):
        Person.__init__(self, name, classRoom, age)
        self.__branches = branches
    @property
    def branches(self):
        return self.__branches
    
    @branches.setter   
    def branches(self,  values):
        self.__branches = values
        
    def toString(self) -> str:
        branch:str = ""
        for val in self.__branches:
            branch += val + ", "
        return f"{self.__name} - {self.__age} - {branch[0:-2]}"
    