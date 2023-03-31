.class La/g/j/e$e;
.super La/g/j/e$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/j/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field private final b:Z


# direct methods
.method constructor <init>(La/g/j/e$c;Z)V
    .locals 0

    invoke-direct {p0, p1}, La/g/j/e$d;-><init>(La/g/j/e$c;)V

    iput-boolean p2, p0, La/g/j/e$e;->b:Z

    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 1

    iget-boolean v0, p0, La/g/j/e$e;->b:Z

    return v0
.end method
