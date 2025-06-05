package com.example;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

public class TimerFunction {
    @FunctionName("TimerTriggerFunction")
    public void run(
        @TimerTrigger(name = "timerInfo", schedule = "0 */5 * * * *") String timerInfo,
        final ExecutionContext context
    ) {
        context.getLogger().info("Timer Trigger executed at: " + java.time.LocalDateTime.now());
    }
}
