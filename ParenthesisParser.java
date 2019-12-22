package parenthesisparser;

import java.io.FileReader;

/**
 *
 * @author Tamar Aufrichtig
 */
public class ParenthesisParser
{

    /**
     * @param args the command line arguments args[0] = filename to scream
     */
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("no filename provided");
        } else
        {
            try (FileReader fr = new FileReader(args[0]))
            {
                boolean wellFormed = true;
                Stack<Character> parenStack = new Stack<>();
                int num;

                while ((num = (fr.read())) != -1 && wellFormed)
                {
                    char ch = (char) num;

                    if (ch == '(' || ch == '['
                            || ch == '{' || ch == '<')
                    {
                        parenStack.push(ch);
                    } else
                    {
                        switch (ch)
                        {
                            case ')':
                                if (parenStack.isEmpty() || parenStack.pop() != '(')
                                {
                                    wellFormed = false;
                                } else
                                {
                                    break;
                                }
                            case ']':
                                if (parenStack.isEmpty() || parenStack.pop() != '[')
                                {
                                    wellFormed = false;
                                } else
                                {
                                    break;
                                }
                            case '}':
                                if (parenStack.isEmpty() || parenStack.pop() != '{')
                                {
                                    wellFormed = false;
                                } else
                                {
                                    break;
                                }
                            case '>':
                                if (parenStack.isEmpty() || parenStack.pop() != '<')
                                {
                                    wellFormed = false;
                                } else
                                {
                                    break;
                                }
                        }
                    }
                }
                if (wellFormed && parenStack.isEmpty())
                {
                    System.out.println("Well-formed.");
                } else
                {
                    System.out.println("NOT well-formed.");
                }

            } catch (Exception io)
            {
                System.out.println(io.getMessage());
            }
        }
    }
}
