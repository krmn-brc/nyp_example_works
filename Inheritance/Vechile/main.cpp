#include <iostream>
#include <string>

using std::string;


class Vechicle
{
    protected:
        string manufacturer;
        int year;
        string color;

    public:
        string getManufacturer(){
                return manufacturer;
        }
        void setManufacturer(string value){
                this->manufacturer = value;
        }

        int getYear(){
            return year;
        }
        void setYear(int value){
            this->year = value;
        }
        string getColor(){
            return this->color;
        }
        void setColor(string value){
            this->color = value;
        }

        Vechicle(){
            std::cout << "\nAn instance has been derived from Vechicle" << std::endl;
        }
        Vechicle(string manufacturer, int year, string color):Vechicle(){
            std::cout << "\nAn instance with full parameters has been derived from Vechicle " << std::endl;
            this->manufacturer = manufacturer;
            this->year = year;
            this->color = color;
        }

        virtual void start()
        {
            std::cout << "Vechicle has been started " << std::endl; 
        }
        virtual void stop()
        {
            std::cout << "Vechicle has been stopped " << std::endl; 
        }
        virtual void drive()
        {
            std::cout << "Vechicle is driving... " << std::endl; 
        }
        virtual string toString()
        {
            return manufacturer + " - " + std::to_string(year) + " - " + color;
        }

};

class Car : public Vechicle
{
    
    public :
        Car()
        {
            std::cout << "\nAn instance has been derived from Car." << std::endl;
        }
        Car(string manufacturer, int year, string color):Vechicle(manufacturer, year, color)
        {
             std::cout << "\nAn instance with full parameters has been derived from Car." << std::endl;
        }
        void openSunRoof()
        {
            std::cout << "The sunroof has been opend." << std::endl;
        }
        void drive() override
        {
            std::cout << "The car manufacturer by " << this->manufacturer << " is being driven." << std::endl;
        }
};

class Bus : public Vechicle
{
    public :
        Bus()
        {
            std::cout << "\nAn instance with has been derived from Bus." << std::endl;
        }
        Bus(string manufacturer, int year, string color):Vechicle(manufacturer, year, color)
        {
            std::cout << "\nAn instance with full parameters has been derived from Car." << std::endl;
        }
        void scheduling()
        {
            std::cout << " Scheduling " << std::endl;
        }

        void drive() override
        {
            std::cout << "The bus manufacturer by " << this->manufacturer << " is being driven." << std::endl;
        }

};

class SchoolBus:public Bus
{
    public: 
        SchoolBus()
        {
            std::cout << "\nAn instance has been derived from Car." << std::endl;
        }
        SchoolBus(string manufacturer, int year, string color):Bus(manufacturer, year, color)
        {
            std::cout << "\nAn instance with full parameters has been derived from Car." << std::endl;
        }

        void getFare()
        {
            std::cout << "getFare() has been called." << std::endl;
        }

        void drive() override
        {
            std::cout << "The school bus manufacturer by " << this->manufacturer << " is being driven." << std::endl;
        }
};


int main()
{

    Vechicle item1 = Vechicle("Scoda", 2019, "White");
    std::cout << item1.toString() << std::endl;

    Car item2 = Car();
    item2.setManufacturer("Togg");
    item2.setYear(2021);
    item2.setColor("Green");
    std::cout << item2.toString() << std::endl;
    item2.openSunRoof();

    Car item3 = Car("Opel", 2020, "Black");
    std::cout << item3.toString() << std::endl;
    item3.openSunRoof();

    Bus item4 = Bus("Anadolu Isuzu", 2018, "Red");
    std::cout << item4.toString() << std::endl;
    item4.scheduling();

    SchoolBus item5 = SchoolBus("Isuzu", 2019, "Yellow");
    std::cout << item5.toString() << std::endl;
    item5.scheduling();
    item5.getFare();

    item1.drive();
    item1.stop();

    item2.drive();
    item2.stop();

    item3.drive();
    item3.stop();

    item4.drive();
    item4.stop();

    item5.drive();
    item5.stop();


    char c = getchar();
    return 0;
}