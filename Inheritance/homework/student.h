#include <iostream>
#include <string>
using std::string;
using namespace std;



class Student: public Person
{
    private :
        string studenNumber;

    public :
        Student():Person()
        {

        }
        Student(string name, string classRoom, int age, string studentNumber):
        Person(name, classRoom, age)
        {
            this->studenNumber = studenNumber;
        }

        void setStudentNumber(string value)
        {
            this->studenNumber = value;
        } 
        string getStudentNumber()
        {
            return this->studenNumber;
        }

        string toString() override
        {
            return "Öğrencinin: \n" + name + " - " + classRoom + " - " + std::to_string(age) + " - " + studenNumber;
        }   
};