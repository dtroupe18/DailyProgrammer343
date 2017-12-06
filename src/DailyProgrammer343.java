/*
 * Created by Dave on 12/5/17.
 */
import java.util.Arrays;
import java.util.Scanner;

public class DailyProgrammer343 {

    private static String[] notes = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};
    private static String solfegeNotes[] = {"Do","Re","Mi","Fa","So","La","Ti"};
    private static int[] indexes = {0, 2, 4, 5, 7, 9, 11};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of the major scale you are using: ");
        String scale = scan.nextLine();
        System.out.print("Enter the solfège name of a note: ");
        String solfege = scan.nextLine();

        String solution = note(scale, solfege);
    }

    public static String note(String scale, String solfege) {
        String[] majScale = getMajorScale(scale);
        if (majScale != null) {
            return getNoteInScale(majScale, solfege);
        }
        else {
            return null;
        }
    }

    private static String getNoteInScale(String[] majorScale, String solfegeName) {
        int index = Arrays.asList(solfegeNotes).indexOf(solfegeName);
        if (index != -1) {
            return majorScale[index];
        }
        else {
            return "Invalid solfège name";
        }
    }

    private static String[] getMajorScale(String letter) {
        String[] scale = null;
        int index = Arrays.asList(notes).indexOf(letter);
        if (index != -1) {
            scale = new String[7];
            // get the seven notes in the major scale
            // index, index +2, +4, +5, +7, +9, +11
            int notesAdded = 0;
            for(int i: indexes) {
                if (index + i <= notes.length - 1) {
                    scale[notesAdded] = notes[index + i];
                    notesAdded++;
                }
                else {
                    int location = (index + i) % 12;
                    // System.out.println("location: " + location);
                    scale[notesAdded] = notes[location];
                    notesAdded++;
                }
            }
            // System.out.println(Arrays.toString(scale));
            return scale;
        }
        else {
            System.out.println("Invalid note entered");
            return scale;
        }
    }
}
