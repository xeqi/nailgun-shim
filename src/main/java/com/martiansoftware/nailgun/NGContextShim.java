package com.martiansoftware.nailgun;

import java.io.PrintStream;
import java.net.InetAddress;
import java.util.Properties;

public class NGContextShim extends NGContext{
    public NGContextShim(){
        super();
    }
    public void setExitStream(PrintStream exitStream) {
        super.setExitStream(exitStream);
    }

    public void setPort(int remotePort) {
        super.setPort(remotePort);
    }

    public void setCommand(String command) {
        super.setCommand(command);
    }

    public void setWorkingDirectory(String workingDirectory) {
        super.setWorkingDirectory(workingDirectory);
    }

    public void setEnv(Properties remoteEnvironment) {
        super.setEnv(remoteEnvironment);
    }

    public void setInetAddress(InetAddress remoteHost) {
        super.setInetAddress(remoteHost);
    }

    public void setArgs(String[] args) {
        super.setArgs(args);
    }

    public void setNGServer(NGServer server) {
        super.setNGServer(server);
    }


}
