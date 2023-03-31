.class Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/h/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->authenticate(La/g/h/a;Lb/b/a/b/a/b;Lb/b/a/b/a/c$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;


# direct methods
.method constructor <init>(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;)V
    .locals 0

    iput-object p1, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$2;->this$0:Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 1

    iget-object v0, p0, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule$2;->this$0:Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;

    invoke-static {v0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->access$200(Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;)Lcom/samsung/android/sdk/pass/SpassFingerprint;

    move-result-object v0

    invoke-static {v0}, Lcom/github/ajalt/reprint/module/spass/SpassReprintModule;->access$300(Lcom/samsung/android/sdk/pass/SpassFingerprint;)V

    return-void
.end method
