.class La/g/j/e$f;
.super La/g/j/e$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/j/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# static fields
.field static final b:La/g/j/e$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/g/j/e$f;

    invoke-direct {v0}, La/g/j/e$f;-><init>()V

    sput-object v0, La/g/j/e$f;->b:La/g/j/e$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La/g/j/e$d;-><init>(La/g/j/e$c;)V

    return-void
.end method


# virtual methods
.method protected a()Z
    .locals 2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, La/g/j/f;->b(Ljava/util/Locale;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
