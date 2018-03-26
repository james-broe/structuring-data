import java.util.*;

class Bst {

  int value;
  Bst parent;
  Bst left;
  Bst right;

  public Bst() {
    this.parent = null;
    this.value = null;
    this.left = null;
    this.right = null;
  }

  public add(int value) {
    if (this.value == null || this.value == value) {
      this.value = value;
      return;
    }
    if (value < this.value) {
      if (this.left == null) {
        this.left = new Bst();
        this.left.parent = this;
        this.left.value = value;
        return;
      }
      this.left.add(value);
      return;
    }
    if (value > this.value) {
      if (this.right == null) {
        this.right = new Bst();
        this.right.value = value;
        return;
      }
      this.right.add(value);
      return;
    }
  }

  public int remove(int value) {
    if (this.value == value) {
      this.value = null;
      return;
    }
    if (value < this.value) {
      if (this.left == null) {
        return null;
      }
      this.left.remove(value);
      return;
    }
    if (value > this.value) {
      if (this.right == null) {
        this.right = new Bst();
        this.right.value = value;
        return;
      }
      this.right.add(value);
      return;
    }
  }


}
