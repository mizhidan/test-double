package mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import stub.GradeService;
import stub.GradeSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {

    private GradeService gradeService;

    @BeforeEach
    public void setUp() {
        GradeSystem gradeSystem = mock(GradeSystem.class);
        when(gradeSystem.gradesFor(1)).thenReturn(Arrays.asList(90.0, 90.0, 90.0));
        gradeService = new GradeService(gradeSystem);
    }

    @Test
    public void calculate_student_avg_score() {
        assertEquals(gradeService.calculateAverageGrades(1), 90.0);
    }



}