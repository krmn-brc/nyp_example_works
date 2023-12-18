// See https://aka.ms/new-console-template for more information
using RockPaperScissorsGame;


var nLose = new HumanPlayer();
var nWin = new RandomComputerPlayer();
bool game = true;
nLose.UserWelcome();

while (game)
{
    nLose.UserMove();
    nWin.PcMove();
    Console.WriteLine($"\n{nLose.GamingName} Seçimi: {GetElement(nLose.SelectMove)}");
    Console.WriteLine($"{nWin.ComputerName} Seçimi: {GetElement(nWin.SelectMove)}\n");
    
    if (nLose.SelectMove.Equals(nWin.SelectMove))
        Console.WriteLine(String.Format("{0} : {0} berabere.\n", GetElement(nLose.SelectMove)), ConsoleColor.White);
    else if (nLose.SelectMove == "rock" && nWin.SelectMove == "paper")
    {
        
        Console.WriteLine($"\nKağıt makası sarar: {nWin.ComputerName} kazandı.\n", ConsoleColor.Magenta);
        nWin.Point++;
    }
    else if (nLose.SelectMove == "rock" && nWin.SelectMove == "scissors")
    {
        Console.WriteLine($"\nTaş makası kırar: {nLose.GamingName} kazandı.\n", ConsoleColor.Green);
        nLose.Point++;
    }
    else if (nLose.SelectMove == "paper" && nWin.SelectMove == "rock")
    {
        Console.WriteLine($"\nKağıt makası sarar: {nLose.GamingName} kazandı.\n", ConsoleColor.Green);
        nLose.Point++;
    }
    else if (nLose.SelectMove == "paper" && nWin.SelectMove == "scissors")
    {
        Console.WriteLine($"\nMakas kağıdı keser: {nWin.ComputerName} kazandı.\n", ConsoleColor.Magenta);
        nWin.Point++;
    }
    else if (nLose.SelectMove == "scissors" && nWin.SelectMove == "rock")
    {
        Console.WriteLine($"\nTaş makası kırar: {nWin.ComputerName} kazandı.\n", ConsoleColor.Magenta);
        nWin.Point++;
    }
    else if (nLose.SelectMove == "scissors" && nWin.SelectMove == "paper")
    {
        Console.WriteLine($"\nMakas kağıdı keser: {nLose.GamingName} kazandı.\n", ConsoleColor.Green);
        nLose.Point++;
    }

    game = IsContinue(nLose, nWin);
       
}





static string GetElement(string selection)
{
    switch (selection)
    {
        case "rock": return "Taş";
        case "paper": return "Kağıt";
        case "scissors": return "Makas";
        default: return String.Empty;
    }
}

static bool IsContinue(HumanPlayer nLose, RandomComputerPlayer nWin)
{
   
    bool game;
    Console.Write("Oyuna devam etmek istiyormusunuz (E/H): ");
    string? isContinue = Console.ReadLine();
    if (isContinue?.ToLower() == "e")
        game = true;
    else if (isContinue?.ToLower() == "h")
    {   
        Console.WriteLine($"{nLose.GamingName}: {nLose.Point} puan");
        Console.WriteLine($"{nWin.ComputerName}: {nWin.Point} puan");
        game = false;
    }
    else
        game = true;
    return game;
}