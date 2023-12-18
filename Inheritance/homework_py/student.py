from person import Person


class Student(Person):
    def __init__(self, name:str="Default", classRoom:str="", age:int=0, studentNumber:str="0000"):
        Person.__init__(self, name, classRoom, age)
        self.__studentNumber = studentNumber
        
    @property
    def studentNumber(self)->str:
        return self.__studentNumber
    @studentNumber.setter
    def studentNumber(self, value:str):
        self.__studentNumber=value