from person import Person
from student import Student
from teacher import Teacher


def main():
    l = ["Türkçe", "Matematik"]
    p = Student("Ali", "8A", 17)
    tc = Teacher("Mustafa", "", 42, l)
    print(p.toString())
    print(tc.toString())
    
    
    
    
    
    
    
    
    
main()