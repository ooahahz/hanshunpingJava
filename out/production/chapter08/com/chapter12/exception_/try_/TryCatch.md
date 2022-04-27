## try-catch 异常处理
1. 如果没有出现异常，则执行 try 中的所有的语句，不执行 catch 块中的语句
，如果有 finally，最后还要执行 finally 里面的语句
2. 如果出现异常，则 try 中异常发生后，try 剩下的语句不再执行。将执行 catch 块
中的语句，如果有 finally，最后还需执行 finally 里面的语句。