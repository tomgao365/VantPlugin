package main.java.com.vant;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Ricky
 */
public class VantFileType extends LanguageFileType {
    public static final VantFileType INSTANCE = new VantFileType();

    private VantFileType() {
        super(VantLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "vant file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "vant file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "vant";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return VantIcons.FILE;
    }
}
