.class final enum Lb/b/a/b/a/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb/b/a/b/a/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lb/b/a/b/a/d;

.field public static final f:Lb/b/a/b/a/c$a;

.field private static final synthetic g:[Lb/b/a/b/a/d;


# instance fields
.field private b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "La/g/h/a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lb/b/a/b/a/e;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb/b/a/b/a/d;

    const/4 v1, 0x0

    const-string v2, "INSTANCE"

    invoke-direct {v0, v2, v1}, Lb/b/a/b/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/b/a/b/a/d;->e:Lb/b/a/b/a/d;

    const/4 v2, 0x1

    new-array v2, v2, [Lb/b/a/b/a/d;

    aput-object v0, v2, v1

    sput-object v2, Lb/b/a/b/a/d;->g:[Lb/b/a/b/a/d;

    new-instance v0, Lb/b/a/b/a/d$a;

    invoke-direct {v0}, Lb/b/a/b/a/d$a;-><init>()V

    sput-object v0, Lb/b/a/b/a/d;->f:Lb/b/a/b/a/c$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lb/b/a/b/a/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb/b/a/b/a/d;->d:Landroid/content/Context;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private b(Landroid/content/Context;Lb/b/a/b/a/c$a;)V
    .locals 6

    :try_start_0
    const-string v0, "com.github.ajalt.reprint.module.spass.SpassReprintModule"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/Class;

    const-class v3, Landroid/content/Context;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Lb/b/a/b/a/c$a;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v4

    aput-object p2, v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb/b/a/b/a/e;

    invoke-virtual {p0, p1}, Lb/b/a/b/a/d;->a(Lb/b/a/b/a/e;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/b/a/b/a/d;
    .locals 1

    const-class v0, Lb/b/a/b/a/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb/b/a/b/a/d;

    return-object p0
.end method

.method public static values()[Lb/b/a/b/a/d;
    .locals 1

    sget-object v0, Lb/b/a/b/a/d;->g:[Lb/b/a/b/a/d;

    invoke-virtual {v0}, [Lb/b/a/b/a/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/b/a/b/a/d;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lb/b/a/b/a/c$a;)V
    .locals 3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lb/b/a/b/a/d;->d:Landroid/content/Context;

    iget-object v0, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    if-nez v0, :cond_4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    sget-object p2, Lb/b/a/b/a/d;->f:Lb/b/a/b/a/c$a;

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_2

    invoke-direct {p0, p1, p2}, Lb/b/a/b/a/d;->b(Landroid/content/Context;Lb/b/a/b/a/c$a;)V

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v1, :cond_4

    new-instance v0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;

    invoke-direct {v0, p1, p2}, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;-><init>(Landroid/content/Context;Lb/b/a/b/a/c$a;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v2, v1, :cond_3

    invoke-virtual {v0}, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;->isHardwarePresent()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-direct {p0, p1, p2}, Lb/b/a/b/a/d;->b(Landroid/content/Context;Lb/b/a/b/a/c$a;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Lb/b/a/b/a/d;->a(Lb/b/a/b/a/e;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public a(Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;)V
    .locals 8

    iget-object v0, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lb/b/a/b/a/e;->isHardwarePresent()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    invoke-interface {v0}, Lb/b/a/b/a/e;->hasFingerprintRegistered()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v2, Lb/b/a/b/a/a;->d:Lb/b/a/b/a/a;

    const/4 v3, 0x1

    sget p2, Lb/b/a/a/a;->fingerprint_not_recognized:I

    invoke-direct {p0, p2}, Lb/b/a/b/a/d;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V

    return-void

    :cond_1
    iget-object v0, p0, Lb/b/a/b/a/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, La/g/h/a;

    invoke-direct {v1}, La/g/h/a;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    iget-object v1, p0, Lb/b/a/b/a/d;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/g/h/a;

    invoke-interface {v0, v1, p1, p2}, Lb/b/a/b/a/e;->authenticate(La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;)V

    return-void

    :cond_2
    :goto_0
    sget-object v3, Lb/b/a/b/a/a;->b:Lb/b/a/b/a/a;

    const/4 v4, 0x1

    sget p2, Lb/b/a/a/a;->fingerprint_error_hw_not_available:I

    invoke-direct {p0, p2}, Lb/b/a/b/a/d;->a(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    invoke-interface/range {v2 .. v7}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V

    return-void
.end method

.method public a(Lb/b/a/b/a/e;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lb/b/a/b/a/e;->tag()I

    move-result v0

    iget-object v1, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    invoke-interface {v1}, Lb/b/a/b/a/e;->tag()I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lb/b/a/b/a/e;->isHardwarePresent()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    :cond_1
    :goto_0
    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lb/b/a/b/a/e;->hasFingerprintRegistered()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lb/b/a/b/a/d;->c:Lb/b/a/b/a/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lb/b/a/b/a/e;->isHardwarePresent()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
