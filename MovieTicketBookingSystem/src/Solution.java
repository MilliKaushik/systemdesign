import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long totalPackets = Long.parseLong(bufferedReader.readLine().trim());

        int uploadedChunksRows = Integer.parseInt(bufferedReader.readLine().trim());
        int uploadedChunksColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Long>> uploadedChunks = new ArrayList<>();

        for (int i = 0; i < uploadedChunksRows; i++) {
            String[] uploadedChunksRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Long> uploadedChunksRowItems = new ArrayList<>();

            for (int j = 0; j < uploadedChunksColumns; j++) {
                long uploadedChunksItem = Long.parseLong(uploadedChunksRowTempItems[j]);
                uploadedChunksRowItems.add(uploadedChunksItem);
            }

            uploadedChunks.add(uploadedChunksRowItems);
        }

        int result = Result.minimumChunksRequired(totalPackets, uploadedChunks);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
