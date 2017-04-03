package illichso;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Result {
    X("X"),
    O("X"),
    D("Draw");

    private String value;

}
