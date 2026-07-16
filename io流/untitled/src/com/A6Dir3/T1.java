package com.A6Dir3;

/**
 * 夏辰义
 * 2026/7/1518:15
 */
import java.io.File;

public class T1 {
    public static void main(String[] args) {
        File file = new File("D:/test/demo.txt");

        // 删除文件（成功返回 true，不存在或删除失败返回 false）
        boolean deleted = file.delete();
        System.out.println("删除文件: " + deleted);

        // 删除目录（目录必须为空才能删除！）
        File emptyDir = new File("D:/test/empty");
        emptyDir.delete();

        File oldFile = new File("D:/test/old.txt");
        File newFile = new File("D:/test/new.txt");

// 重命名（同一目录内）
        oldFile.renameTo(newFile);

// 移动文件（不同目录）
        File target = new File("D:/backup/old.txt");
        oldFile.renameTo(target);  // 相当于剪切
    }

    // 递归删除目录（包括子文件和子目录）
    static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] children = dir.listFiles();
            if (children != null) {
                for (File child : children) {
                    deleteDir(child);  // 先删子内容
                }
            }
        }
        return dir.delete();  // 再删自己
    }
}
/*
| 陷阱                        | 说明                                                 |
| ------------------------- | -------------------------------------------------- |
| `mkdir()` 只能创建单级目录        | 父目录不存在时返回 false，用 `mkdirs()`                       |
| `delete()` 不能删非空目录        | 必须先递归清空内容                                          |
| 路径分隔符                     | Windows 用 `\`，Linux/Mac 用 `/`，推荐用 `File.separator` |
| `createNewFile()` 不会创建父目录 | 父目录不存在会抛 `IOException`                             |
| `listFiles()` 返回 null     | 当前 File 不是目录，或没有权限读取时                              |

 */