;

/**
 * 夏辰义
 * 2026/7/720:53
 */
public class 生命周期 {
}
/*
                    start()
    NEW ─────────────────────────► RUNNABLE ◄──────┐
                                   │  ▲            │
                    获得CPU ◄──────┘  └────── 让出CPU/yield
                    │                              │
                    │    wait()                    │
                    ▼    join()无参                │
                 WAITING ◄─────────────────────────┤
                    │    notify()/notifyAll()      │
                    └──────────────────────────────┘

                    sleep(ms)
                    wait(ms)
                    join(ms)
    RUNNABLE ─────► TIMED_WAITING ─────► 时间到 ──► RUNNABLE
                    │
                    └─► interrupt() ──► 抛异常处理

                    等待锁
    RUNNABLE ─────► BLOCKED ─────► 拿到锁 ──► RUNNABLE

    RUNNABLE ─────► run()结束/异常 ──► TERMINATED
    | 状态             | 触发条件                                  | 唤醒方式                             |
| -------------- | ------------------------------------- | -------------------------------- |
| NEW            | `new Thread()`                        | `start()`                        |
| RUNNABLE       | `start()` / 被调度                       | 时间片用完/让出CPU                      |
| BLOCKED        | 等待 `synchronized` 锁                   | 拿到锁                              |
| WAITING        | `wait()` / `join()`                   | `notify()` / 目标线程结束              |
| TIMED\_WAITING | `sleep(ms)` / `wait(ms)` / `join(ms)` | 时间到 / `notify()` / `interrupt()` |
| TERMINATED     | `run()` 结束 / 异常                       | 无，已死亡                            |

 */