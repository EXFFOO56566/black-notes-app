.class Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;
.super Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AuthCallback"
.end annotation


# instance fields
.field private final cancellationSignal:La/g/h/a;

.field private listener:Lb/b/a/b/a/b;

.field private restartCount:I

.field private final restartPredicate:Lb/b/a/b/a/c$b;

.field final synthetic this$0:Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;


# direct methods
.method private constructor <init>(Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;ILb/b/a/b/a/c$b;La/g/h/a;Lb/b/a/b/a/b;)V
    .locals 0

    iput-object p1, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->this$0:Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;

    invoke-direct {p0}, Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;-><init>()V

    iput p2, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartCount:I

    iput-object p3, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartPredicate:Lb/b/a/b/a/c$b;

    iput-object p4, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->cancellationSignal:La/g/h/a;

    iput-object p5, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;ILb/b/a/b/a/c$b;La/g/h/a;Lb/b/a/b/a/b;Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$1;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;-><init>(Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;ILb/b/a/b/a/c$b;La/g/h/a;Lb/b/a/b/a/b;)V

    return-void
.end method


# virtual methods
.method public onAuthenticationError(ILjava/lang/CharSequence;)V
    .locals 9

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lb/b/a/b/a/a;->i:Lb/b/a/b/a/a;

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eq p1, v1, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    if-eq p1, v2, :cond_3

    const/4 v1, 0x4

    if-eq p1, v1, :cond_4

    const/4 v1, 0x5

    if-eq p1, v1, :cond_2

    const/4 v1, 0x7

    if-eq p1, v1, :cond_1

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_1
    sget-object v0, Lb/b/a/b/a/a;->f:Lb/b/a/b/a/a;

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    sget-object v0, Lb/b/a/b/a/a;->g:Lb/b/a/b/a/a;

    goto :goto_0

    :cond_4
    sget-object v0, Lb/b/a/b/a/a;->e:Lb/b/a/b/a/a;

    goto :goto_0

    :cond_5
    sget-object v0, Lb/b/a/b/a/a;->c:Lb/b/a/b/a/a;

    goto :goto_0

    :goto_1
    if-ne p1, v2, :cond_6

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartPredicate:Lb/b/a/b/a/c$b;

    iget v1, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartCount:I

    invoke-interface {v0, v4, v1}, Lb/b/a/b/a/c$b;->a(Lb/b/a/b/a/a;I)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->this$0:Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;

    iget-object p2, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->cancellationSignal:La/g/h/a;

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    iget-object v1, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartPredicate:Lb/b/a/b/a/c$b;

    iget v2, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartCount:I

    invoke-virtual {p1, p2, v0, v1, v2}, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;->authenticate(La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;I)V

    goto :goto_2

    :cond_6
    iget-object v3, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    const/4 v5, 0x1

    const/4 v7, 0x1

    move-object v6, p2

    move v8, p1

    invoke-interface/range {v3 .. v8}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    :goto_2
    return-void
.end method

.method public onAuthenticationFailed()V
    .locals 6

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v1, Lb/b/a/b/a/a;->h:Lb/b/a/b/a/a;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->this$0:Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;

    invoke-static {v3}, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;->access$100(Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule;)Landroid/content/Context;

    move-result-object v3

    sget v4, Lb/b/a/a/a;->fingerprint_not_recognized:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/16 v5, 0x3e9

    invoke-interface/range {v0 .. v5}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V

    return-void
.end method

.method public onAuthenticationHelp(ILjava/lang/CharSequence;)V
    .locals 7

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartPredicate:Lb/b/a/b/a/c$b;

    sget-object v1, Lb/b/a/b/a/a;->e:Lb/b/a/b/a/a;

    iget v2, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartCount:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->restartCount:I

    invoke-interface {v0, v1, v2}, Lb/b/a/b/a/c$b;->a(Lb/b/a/b/a/a;I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->cancellationSignal:La/g/h/a;

    invoke-virtual {v0}, La/g/h/a;->a()V

    :cond_1
    iget-object v1, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    sget-object v2, Lb/b/a/b/a/a;->e:Lb/b/a/b/a/a;

    const/4 v3, 0x0

    const/4 v5, 0x1

    move-object v4, p2

    move v6, p1

    invoke-interface/range {v1 .. v6}, Lb/b/a/b/a/b;->a(Lb/b/a/b/a/a;ZLjava/lang/CharSequence;II)V

    return-void
.end method

.method public onAuthenticationSucceeded(Landroid/hardware/fingerprint/FingerprintManager$AuthenticationResult;)V
    .locals 1

    iget-object p1, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lb/b/a/b/a/b;->a(I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/github/ajalt/reprint/module/marshmallow/MarshmallowReprintModule$AuthCallback;->listener:Lb/b/a/b/a/b;

    return-void
.end method
