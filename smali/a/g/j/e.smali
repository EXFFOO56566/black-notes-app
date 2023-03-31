.class public final La/g/j/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/g/j/e$f;,
        La/g/j/e$a;,
        La/g/j/e$b;,
        La/g/j/e$c;,
        La/g/j/e$e;,
        La/g/j/e$d;
    }
.end annotation


# static fields
.field public static final a:La/g/j/d;

.field public static final b:La/g/j/d;

.field public static final c:La/g/j/d;

.field public static final d:La/g/j/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La/g/j/e$e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La/g/j/e$e;-><init>(La/g/j/e$c;Z)V

    sput-object v0, La/g/j/e;->a:La/g/j/d;

    new-instance v0, La/g/j/e$e;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, La/g/j/e$e;-><init>(La/g/j/e$c;Z)V

    sput-object v0, La/g/j/e;->b:La/g/j/d;

    new-instance v0, La/g/j/e$e;

    sget-object v1, La/g/j/e$b;->a:La/g/j/e$b;

    invoke-direct {v0, v1, v2}, La/g/j/e$e;-><init>(La/g/j/e$c;Z)V

    sput-object v0, La/g/j/e;->c:La/g/j/d;

    new-instance v0, La/g/j/e$e;

    sget-object v1, La/g/j/e$b;->a:La/g/j/e$b;

    invoke-direct {v0, v1, v3}, La/g/j/e$e;-><init>(La/g/j/e$c;Z)V

    sput-object v0, La/g/j/e;->d:La/g/j/d;

    new-instance v0, La/g/j/e$e;

    sget-object v1, La/g/j/e$a;->b:La/g/j/e$a;

    invoke-direct {v0, v1, v2}, La/g/j/e$e;-><init>(La/g/j/e$c;Z)V

    sget-object v0, La/g/j/e$f;->b:La/g/j/e$f;

    return-void
.end method

.method static a(I)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v0
.end method

.method static b(I)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    packed-switch p0, :pswitch_data_0

    return v1

    :cond_0
    :pswitch_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :pswitch_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
