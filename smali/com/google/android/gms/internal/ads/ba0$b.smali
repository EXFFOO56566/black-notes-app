.class public final enum Lcom/google/android/gms/internal/ads/ba0$b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/tz1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/ba0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/ba0$b;",
        ">;",
        "Lcom/google/android/gms/internal/ads/tz1;"
    }
.end annotation


# static fields
.field private static final enum c:Lcom/google/android/gms/internal/ads/ba0$b;

.field private static final enum d:Lcom/google/android/gms/internal/ads/ba0$b;

.field private static final enum e:Lcom/google/android/gms/internal/ads/ba0$b;

.field private static final enum f:Lcom/google/android/gms/internal/ads/ba0$b;

.field private static final enum g:Lcom/google/android/gms/internal/ads/ba0$b;

.field private static final enum h:Lcom/google/android/gms/internal/ads/ba0$b;

.field private static final enum i:Lcom/google/android/gms/internal/ads/ba0$b;

.field private static final synthetic j:[Lcom/google/android/gms/internal/ads/ba0$b;


# instance fields
.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/google/android/gms/internal/ads/ba0$b;

    const/4 v1, 0x0

    const-string v2, "DEBUGGER_STATE_UNSPECIFIED"

    invoke-direct {v0, v2, v1, v1}, Lcom/google/android/gms/internal/ads/ba0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba0$b;->c:Lcom/google/android/gms/internal/ads/ba0$b;

    new-instance v0, Lcom/google/android/gms/internal/ads/ba0$b;

    const/4 v2, 0x1

    const-string v3, "DEBUGGER_STATE_NOT_INSTALLED"

    invoke-direct {v0, v3, v2, v2}, Lcom/google/android/gms/internal/ads/ba0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba0$b;->d:Lcom/google/android/gms/internal/ads/ba0$b;

    new-instance v0, Lcom/google/android/gms/internal/ads/ba0$b;

    const/4 v3, 0x2

    const-string v4, "DEBUGGER_STATE_INSTALLED"

    invoke-direct {v0, v4, v3, v3}, Lcom/google/android/gms/internal/ads/ba0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba0$b;->e:Lcom/google/android/gms/internal/ads/ba0$b;

    new-instance v0, Lcom/google/android/gms/internal/ads/ba0$b;

    const/4 v4, 0x3

    const-string v5, "DEBUGGER_STATE_ACTIVE"

    invoke-direct {v0, v5, v4, v4}, Lcom/google/android/gms/internal/ads/ba0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba0$b;->f:Lcom/google/android/gms/internal/ads/ba0$b;

    new-instance v0, Lcom/google/android/gms/internal/ads/ba0$b;

    const/4 v5, 0x4

    const-string v6, "DEBUGGER_STATE_ENVVAR"

    invoke-direct {v0, v6, v5, v5}, Lcom/google/android/gms/internal/ads/ba0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba0$b;->g:Lcom/google/android/gms/internal/ads/ba0$b;

    new-instance v0, Lcom/google/android/gms/internal/ads/ba0$b;

    const/4 v6, 0x5

    const-string v7, "DEBUGGER_STATE_MACHPORT"

    invoke-direct {v0, v7, v6, v6}, Lcom/google/android/gms/internal/ads/ba0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba0$b;->h:Lcom/google/android/gms/internal/ads/ba0$b;

    new-instance v0, Lcom/google/android/gms/internal/ads/ba0$b;

    const/4 v7, 0x6

    const-string v8, "DEBUGGER_STATE_ENVVAR_MACHPORT"

    invoke-direct {v0, v8, v7, v7}, Lcom/google/android/gms/internal/ads/ba0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/ads/ba0$b;->i:Lcom/google/android/gms/internal/ads/ba0$b;

    const/4 v8, 0x7

    new-array v8, v8, [Lcom/google/android/gms/internal/ads/ba0$b;

    sget-object v9, Lcom/google/android/gms/internal/ads/ba0$b;->c:Lcom/google/android/gms/internal/ads/ba0$b;

    aput-object v9, v8, v1

    sget-object v1, Lcom/google/android/gms/internal/ads/ba0$b;->d:Lcom/google/android/gms/internal/ads/ba0$b;

    aput-object v1, v8, v2

    sget-object v1, Lcom/google/android/gms/internal/ads/ba0$b;->e:Lcom/google/android/gms/internal/ads/ba0$b;

    aput-object v1, v8, v3

    sget-object v1, Lcom/google/android/gms/internal/ads/ba0$b;->f:Lcom/google/android/gms/internal/ads/ba0$b;

    aput-object v1, v8, v4

    sget-object v1, Lcom/google/android/gms/internal/ads/ba0$b;->g:Lcom/google/android/gms/internal/ads/ba0$b;

    aput-object v1, v8, v5

    sget-object v1, Lcom/google/android/gms/internal/ads/ba0$b;->h:Lcom/google/android/gms/internal/ads/ba0$b;

    aput-object v1, v8, v6

    aput-object v0, v8, v7

    sput-object v8, Lcom/google/android/gms/internal/ads/ba0$b;->j:[Lcom/google/android/gms/internal/ads/ba0$b;

    new-instance v0, Lcom/google/android/gms/internal/ads/hb0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/hb0;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/ads/ba0$b;->b:I

    return-void
.end method

.method public static a(I)Lcom/google/android/gms/internal/ads/ba0$b;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/ads/ba0$b;->i:Lcom/google/android/gms/internal/ads/ba0$b;

    return-object p0

    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/ads/ba0$b;->h:Lcom/google/android/gms/internal/ads/ba0$b;

    return-object p0

    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/ads/ba0$b;->g:Lcom/google/android/gms/internal/ads/ba0$b;

    return-object p0

    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/ads/ba0$b;->f:Lcom/google/android/gms/internal/ads/ba0$b;

    return-object p0

    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/ads/ba0$b;->e:Lcom/google/android/gms/internal/ads/ba0$b;

    return-object p0

    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/ads/ba0$b;->d:Lcom/google/android/gms/internal/ads/ba0$b;

    return-object p0

    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/ads/ba0$b;->c:Lcom/google/android/gms/internal/ads/ba0$b;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b()Lcom/google/android/gms/internal/ads/vz1;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ic0;->a:Lcom/google/android/gms/internal/ads/vz1;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/ba0$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/ba0$b;->j:[Lcom/google/android/gms/internal/ads/ba0$b;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/ba0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/ba0$b;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/ba0$b;->b:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/google/android/gms/internal/ads/ba0$b;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/ads/ba0$b;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
