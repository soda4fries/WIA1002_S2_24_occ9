public abstract class AbstractBag<T> implements Bag<T>{
    //We will define things that can be generally modelled without knowing the implementation, eg through the interface

    @Override
    public void clear() {
        while (!isEmpty()) remove();
    }

    @Override
    public void addAll(Bag<? extends T> other) {
        for (var item: other) {
            if (isFull()) break;
            this.add(item);
        }
    }

    @Override
    public void putAll(Bag<? super T> other) {
        while (!this.isEmpty()) {
            other.add(this.remove());
        }
    }

    @Override
    public Bag<T> union(Bag<T> other) {
        ArrayBag<T> unionBag = new ArrayBag<>(this.getCurrentSize()+other.getCurrentSize());
        for (T item: this) {
            unionBag.add(item);
        }
        for (T items: other) {
            unionBag.add(items);
        }
        return unionBag;
    }

    @Override
    public Bag<T> intersection(Bag<T> other) {
        ArrayBag<T> intersectionBag = new ArrayBag<>(Math.max(this.getCurrentSize(), other.getCurrentSize()));
        for (T items : this) {
            if (intersectionBag.contains(items)) continue;
            for (int i = Math.min(this.getFrequencyOf(items), other.getFrequencyOf(items)); i > 0; i--) {
                intersectionBag.add(items);
            }
        }
        return intersectionBag;
    }

    @Override
    public Bag<T> difference(Bag<T> other) {
        ArrayBag<T> differnceBag = new ArrayBag<>(this.getCurrentSize());
        for (T item: this.toArray()) {
            differnceBag.add(item);
        }
        for (T item: other) {
            differnceBag.remove(item);
        }
        return differnceBag;
    }

    @Override
    public String toString() {
        StringBuilder tostr = new StringBuilder("[");
        for (var item : this) {
            tostr.append(item.toString());
            tostr.append(",");
        }
        int indexOfComma = tostr.lastIndexOf(",");
        if (indexOfComma!=-1) tostr.deleteCharAt(indexOfComma);
        tostr.append("]");
        return tostr.toString();
    }
}
