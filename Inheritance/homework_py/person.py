class Person:
    def __init__(self, name:str="Default", classRoom:str="Default", age:int=0):
        print("An instance has been derived from Person class")
        self.__name = name
        self.__classRoom = classRoom
        self.__age=age

    @property
    def name(self)->str:
        return self.__name
    @name.setter
    def name(self, value:str):
        self.__name=value
        
    @property
    def classRoom(self)->str:
        return self.__classRoom
    @classRoom.setter
    def classRoom(self, value:str):
        self.__classRoom=value
        
    @property
    def age(self)->int:
        return self.__age
    @age.setter
    def age(self, value:str):
        self.__age=value
    
    def toString(self)->str:
        return f"{self.__name} - {self.__age} - {self.__classRoom}"
    